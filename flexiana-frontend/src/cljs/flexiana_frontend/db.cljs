(ns flexiana-frontend.db)

(def default-db
  {:name "re-frame"})


(defn word
  [db key word]
  (assoc db key word))


(defn get-word
  [db key]
  (get db key))

(defn set-result
  [db result]
  (merge db result))

(defn get-result
  [db]
  (:scrambable db))