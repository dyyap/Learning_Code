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
    ]
}

export default sidebar.WorkbookSidebar