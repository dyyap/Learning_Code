import type {SidebarsConfig} from "@docusaurus/plugin-content-docs"

const sidebar: SidebarsConfig = {
    WorkbookSidebar: [
        {
            type: "doc",
            id: "Workbook/Workbook-yaml",
        },
        {
            type: "category",
            label: "ATM",
            link: {
              type: "generated-index",
              title: "ATM API",
              slug: "/category/ATM-api",
            },
            items: require("./ATM/sidebar.ts"),
          },
    ]
}

export default sidebar.WorkbookSidebar