(ns galois.group)

(defn foldg [seed path]
  (reduce (fn [x y]
            (if (haslink? x y)
              (eval (get-symbol y)) (reduced nil)))
          seed path))

(defn haslink? [x y] (trace "some" (some #{(trace "symbol y" (symbol  y))}
                                    (trace "get" (get (trace "raw x" x) :links)))))

(defn annihilating_elem [x] (last (str/split x #"/home")))
