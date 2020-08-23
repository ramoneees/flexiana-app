(ns flexiana-frontend.events
  (:require
   [re-frame.core :as re-frame]
   [flexiana-frontend.db :as db]
   [ajax.core :as ajax]))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))


(re-frame/reg-event-db
 :set-word
 (fn [db [_ key word]]
   (db/word db key word)))

(re-frame/reg-event-db
 :success-post-result
 (fn [db [_ result]]
   (db/set-result db result)))


(re-frame/reg-event-db
 :failure-post-result
 (fn [db [_ result]]
   (db/set-result db result)))


(re-frame/reg-event-fx
 :scramble?
 (fn [{:keys [db]} _]
   (let [word1 (db/get-word db :word1)
         word2 (db/get-word db :word2)
         params (hash-map :word1 word1 :word2 word2)]
     {:http-xhrio
      {:uri "http://localhost:8080/scrambles"
       :method :post
       :params params
       :format          (ajax/json-request-format)
       :response-format (ajax/json-response-format {:keywords? true})
       :on-success      [:success-post-result]
       :on-failure      [:failure-post-result]}})))