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
  (let [result (re-frame/subscribe [:get-result])]
    [:div
     [:h1 "LET'S SCRAMBLE!!!"]
     (if @result
       [:p "tottaly scrambable!!"]
       [:p "not scrambable at all!!"])
     (scramble-screen)]))
