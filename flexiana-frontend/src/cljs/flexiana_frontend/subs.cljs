(ns flexiana-frontend.subs
  (:require
   [re-frame.core :as re-frame]
   [flexiana-frontend.db :as db]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))


(re-frame/reg-sub
 :get-word
 (fn [db key]
   (db/get-word db key)))
