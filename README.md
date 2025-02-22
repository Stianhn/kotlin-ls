# kotlin-ls
Kotlin Language Server

## How to configure it for Neovim

Run `./gradlew shadowJar`

Create a file on your neovim config and paste this. Make sure to import it.
```
local client = vim.lsp.start_client {
  name = 'Local Kotlin',
  cmd = {
    'java',
    '-jar',
    '<path to dev folder>/app/build/libs/app-all.jar',
  },
}

if not client then
  vim.notify 'Failed to load Local kotlin'
  return
end

vim.lsp.buf_attach_client(0, client)

vim.api.nvim_create_autocmd('FileType', {
  pattern = 'kotlin',
  callback = function()
    vim.lsp.buf_attach_client(0, client)
  end,
})
```

And then the next time you open a Kotlin file you should be able to see the server running by typing `:LspInfo`
