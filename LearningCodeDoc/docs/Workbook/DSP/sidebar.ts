import type { SidebarsConfig } from "@docusaurus/plugin-content-docs";

const sidebar: SidebarsConfig = {
  DSPsidebar: [
    {
      type: "doc",
      id: "Workbook/DSP/DSP-Intro",
    },
    {
      type: "category",
      label: "Introduction",
      items: [
        {
          type: "doc",
          id: "Workbook/DSP/Introduction/Signal",
          label: "Introduction",
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
 ],
};

export default sidebar.DSPsidebar;
