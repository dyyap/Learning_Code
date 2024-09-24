import type { SidebarsConfig } from "@docusaurus/plugin-content-docs";

const sidebar: SidebarsConfig = {
  apisidebar: [
    {
      type: "doc",
      id: "Workbook/ToolsExamples/Tools-Intro",
    },
    {
      type: "category",
      label: "Examples",
      items: [
        {
          type: "doc",
          id: "Workbook/ToolsExamples/Examples/ATM",
          label: "ATM",
          className: "api-method get",
        },
            // {
            //   type: "doc",
            //   id: "restaurant/list-all-products",
            //   label: "List All Products",
            //   className: "api-method get",
            // },
            // {
            //   type: "doc",
            //   id: "restaurant/list-all-drinks",
            //   label: "List All Drinks",
            //   className: "api-method get",
            // },
          ],
    },
        {
          type: "category",
          label: "Tools",
          items: [
            {
              type: "doc",
              id: "Workbook/ToolsExamples/Tools/Generators",
              label: "Generators",
              className: "api-method get",
            },
            {
              type: "doc",
              id: "Workbook/ToolsExamples/Tools/Mathematic-Tools",
              label: "Mathematic Tools",
              className: "api-method get",
            },
            {
              type: "category",
              label: "Algorithms",
              items: 
              [
                {
                  type: "doc",
                  id: "Workbook/ToolsExamples/Tools/Algorithms/Knapsack",
                  label: "Knapsack",
                  className: "api-method get",
                },
              ]
             
            },
          ],
        },
 ],
};

export default sidebar.apisidebar;
