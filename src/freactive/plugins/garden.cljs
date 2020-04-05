(ns freactive.plugins.garden
  (:require
    [freactive.dom :as dom]
    [garden.compiler]
    [garden.types]))

(extend-protocol dom/IDOMAttrValue
  garden.types.CSSUnit
  (-get-attr-value [this]
    (garden.compiler/render-css this)))
