(ns flexiana-backend.scrambles_test
  (:require [clojure.test :refer :all]
            [flexiana-backend.scrambles :refer :all]))


(deftest input-validations
  (is
   (=
    (valid-inputs? "another-string" "a-string")
    true))
  (is
   (=
    (valid-inputs? "" "another-string")
    false))
  (is
   (=
    (valid-inputs? "a-string" nil)
    false)))


(deftest scrambling
  (is
   (= (check-scrambles "rekqodlw" "world")
      true))
  (is
   (= (check-scrambles "cedewaraaossoqqyt" "codewars")
      true))
  (is
   (= (check-scrambles "katas" "steak")
      false)))