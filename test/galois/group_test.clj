(ns galois.group-test
  (:require [clojure.test :refer :all]))

(def about {:message "Hi. I'm Brandon." :links ['home 'site]})
(def site {:message "This site is a clojure application." :links ['home]})

(deftest my-elems-test
  (is (= true true)))
