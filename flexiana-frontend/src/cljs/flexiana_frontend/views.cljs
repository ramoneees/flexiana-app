(ns flexiana-frontend.views
  (:require
   [re-frame.core :as re-frame]
   [flexiana-frontend.events]
   [flexiana-frontend.subs]))

(defn scramble-screen
  []
  [:div
   [:input {:type "text" :value @(re-frame/subscribe [:get-word :word1]) :on-change #(re-frame/dispatch [:set-word :word1 (-> % .-target .-value)])}]
   [:input {:type "text" :value @(re-frame/subscribe [:get-word :word2]) :on-change #(re-frame/dispatch [:set-word :word2 (-> % .-target .-value)])}]
   [:input {:type "submit" :on-click #(re-frame/dispatch [:scramble?])}]])

(defn main-panel []
  [:div
   [:h1 "LET'S SCRAMBLE!!!" @(re-frame/subscribe [:get-result])]
   (scramble-screen)])
