package com.softwaremill.macwire.autocats

import com.softwaremill.macwire.CompileTestsSupport

class CompileTests extends CompileTestsSupport {

  runTestsWith(
    expectedFailures = List(
      "simpleMissingDeps" -> List("Cannot find a value of type: [String]"), //TODO List("Cannot find a value of type: [String], path: B.s")
      "simpleMissingDepsMultiLevel" -> List("Cannot find a value of type: [String]") //TODO List("Cannot find a value of type: [String], path: C.b.a.s")
    ),
    expectedWarnings = List()
  )
}
