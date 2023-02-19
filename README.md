<p align="center">
  <h2 align="center">🌊 KANAGAWA.vscode 🌊</h2>
</p>

<p align="center">VSCode dark colorscheme inspired by the colors found in the <a href="https://github.com/rebelot/kanagawa.nvim">KANAGAWA.nvim</a> repo.</p>

## Disable Italics

If you wish to disable italics, there is now a no-italic theme available. You will have access to both, select **Kanagawa No Italics** as your color theme.  

## Separate the Editor from the Sidebar

```
"workbench.colorCustomizations": {
  "[Kanagawa]": {
    "activityBar.background": "#1F1F28",
    "activityBar.border": "#2A2A37",
    "editorGroup.border": "#2A2A37",
    "sideBar.background": "#2A2A37",
    "sideBar.border": "#2A2A37",
    "sideBar.foreground": "#DCD7BA"
  },
  "[Kanagawa (No Italics)]": {
    "activityBar.background": "#1F1F28",
    "activityBar.border": "#2A2A37",
    "editorGroup.border": "#2A2A37",
    "sideBar.background": "#2A2A37",
    "sideBar.border": "#2A2A37",
    "sideBar.foreground": "#DCD7BA"
  }
},
```

## Semantic tokens

Theme supports and recommends enabling semantic tokens.

**TypeScript**
Enabled by default.

**Go**

```json
  "gopls": {
    "ui.semanticTokens": true,
  },
```

## Acknowledgements

- https://github.com/rebelot/kanagawa.nvim
- <a href="https://www.freepik.com/free-vector/traditional-japanese-wave-sticker-with-white-border-vector_17431695.htm#query=kanagawa&position=4&from_view=keyword&track=sph">Logo by rawpixel.com</a> on Freepik  
