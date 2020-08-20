(ns flexiana-frontend.db)

(def default-db
  {:name "re-frame"})


(defn word
  [db key word]
  (assoc db key word))


(defn get-word
  [db key]
  (get db key))