package org.kotlinls.services

import org.eclipse.lsp4j.DidChangeConfigurationParams
import org.eclipse.lsp4j.DidChangeWatchedFilesParams
import org.eclipse.lsp4j.services.WorkspaceService

class KotlinWorkspaceService : WorkspaceService {
    override fun didChangeConfiguration(params: DidChangeConfigurationParams) {
        println("Workspace configuration changed.")
    }

    override fun didChangeWatchedFiles(params: DidChangeWatchedFilesParams) {
        println("Watched files changed.")
    }
}
