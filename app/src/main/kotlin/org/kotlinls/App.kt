package org.kotlinls

import org.eclipse.lsp4j.jsonrpc.Launcher
import org.eclipse.lsp4j.services.LanguageClient

fun main(args: Array<String>) {
  val server = KotlinLanguageServer()
  val launcher =
      Launcher.createLauncher(server, LanguageClient::class.java, System.`in`, System.out)
  server.connect(launcher.remoteProxy)
  println("Listo...")
  launcher.startListening()
}
