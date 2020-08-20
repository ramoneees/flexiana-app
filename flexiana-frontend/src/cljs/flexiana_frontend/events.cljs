(ns flexiana-frontend.events
  (:require
   [re-frame.core :as re-frame]
   [flexiana-frontend.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))


(re-frame/reg-event-db
 :set-word
 (fn [db [_ key word]]
   (db/word db key word)))
