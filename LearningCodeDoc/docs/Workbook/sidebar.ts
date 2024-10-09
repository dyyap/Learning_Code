import type {SidebarsConfig} from "@docusaurus/plugin-content-docs"

const sidebar: SidebarsConfig = {
    WorkbookSidebar: [
        {
            type: "doc",
            id: "Workbook/Workbook-yaml",
        },
        {
            type: "category",
            label: "Tools and Examples",
            link: {
              type: "generated-index",
              title: "Tools and Examples API",
              slug: "/category/tools-examples-api",
            },
            items: require("./ToolsExamples/sidebar.ts"),
        },
        {
            type: "category",
            label: "DSP",
            link: {
              type: "generated-index",
              title: "DSP Notes",
              slug: "/category/DSP",
            },
            items: require("./DSP/sidebar.ts"),
        },
        {
            type: "category",
            label: "Networking",
            link: {
              type: "generated-index",
              title: "Tools and Examples API",
              slug: "/category/networking",
            },
            items: require("./Networking/sidebar.ts"),
        },
      
    ]
}

export default sidebar.WorkbookSidebar