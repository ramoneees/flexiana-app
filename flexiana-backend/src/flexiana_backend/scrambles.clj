(ns flexiana-backend.scrambles
(:require [clojure.string :as string]))

(def not-blank? (complement string/blank?))

(defn check-scrambles
  [word1 word2]
  (let [vector1 (vec word1)
        vector2 (vec word2)]
    (if (some neg? (map #(.indexOf vector1 %) vector2))
      false
      true)))

(defn valid-inputs?
  [input1 input2]
  (and (not-blank? input1) (not-blank? input2) (>= (count input1) (count input2))))

(defn scrambles?
  [{:keys [word1 word2]}]
  (if (valid-inputs? word1 word2)
    (check-scrambles word1 word2)
    false))