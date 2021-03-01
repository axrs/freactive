(ns freactive.dom.util)

(defn element-state [^js element]
  (when element
    (.-freactive-state element)))

(defn set-element-state! [^js element state]
  (set! (.-freactive-state element) state))

(defn set-original-class-name! [^js element class]
  (set! (.-original-class-name element) class))

(defn original-class-name [^js element]
  (.-original-class-name element))

(defn set-class-name! [^js element class]
  (set! (.-className element) (or class "")))

(defn native-node? [element]
  (when element
    (instance? js/Node element)))
