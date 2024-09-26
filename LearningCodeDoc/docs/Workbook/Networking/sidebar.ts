import type { SidebarsConfig } from "@docusaurus/plugin-content-docs";

const sidebar: SidebarsConfig = {
  Networkingsidebar: [
    {
      type: "doc",
      id: "Workbook/Networking/Networking-Intro",
    },
    {
      type: "category",
      label: "Cybersecurity",
      items: [
        {
          type: "doc",
          id: "Workbook/Networking/CyberSecurity/Security",
          label: "ATM",
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
          label: "Reverse Engineering",
          items: [
            {
              type: "doc",
              id: "Workbook/Networking/Reverse Engineering/Reverse Engineering",
              label: "Reverse engineering",
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

export default sidebar.Networkingsidebar;
