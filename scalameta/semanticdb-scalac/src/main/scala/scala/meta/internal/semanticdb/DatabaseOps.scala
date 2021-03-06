package scala.meta.internal
package semanticdb

import scala.tools.nsc.Global

trait DatabaseOps
    extends AttributesOps
    with ConfigOps
    with DenotationOps
    with InputOps
    with LanguageOps
    with ParseOps
    with ReporterOps
    with PrinterOps
    with SymbolOps
    with MessageOps
    with ReflectionToolkit {
  val global: Global
}
