(ns flexiana-frontend.views
  (:require
   [re-frame.core :as re-frame]
   [flexiana-frontend.subs :as subs]
   ))

(defn scramble-screen
  []
  [:div
   [:input {:type "text" :value #(re-frame/subscribe [:get-name :word1]) :on-change #(re-frame/dispatch [:set-word :word1 (-> % .-target .-value)])}]
   [:input {:type "text" :value #(re-frame/subscribe [:get-name :word2]) :on-change #(re-frame/dispatch [:set-word :word2 (-> % .-target .-value)])}]
   [:input {:type "submit"}]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     (scramble-screen)]))
