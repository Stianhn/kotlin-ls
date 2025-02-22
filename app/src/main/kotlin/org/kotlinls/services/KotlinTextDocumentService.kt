package org.kotlinls.services

import org.eclipse.lsp4j.DidChangeTextDocumentParams
import org.eclipse.lsp4j.DidCloseTextDocumentParams
import org.eclipse.lsp4j.DidOpenTextDocumentParams
import org.eclipse.lsp4j.DidSaveTextDocumentParams
import org.eclipse.lsp4j.services.TextDocumentService

class KotlinTextDocumentService : TextDocumentService {
    override fun didOpen(params: DidOpenTextDocumentParams) {
        println("Opened: ${params.textDocument.uri}")
    }

    override fun didChange(params: DidChangeTextDocumentParams) {
        println("Changed: ${params.textDocument.uri}")
    }

    override fun didClose(params: DidCloseTextDocumentParams) {
        println("Closed: ${params.textDocument.uri}")
    }

    override fun didSave(params: DidSaveTextDocumentParams) {
        println("Saved: ${params.textDocument.uri}")
    }
}
