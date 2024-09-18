import type { SidebarsConfig } from "@docusaurus/plugin-content-docs";

const sidebar: SidebarsConfig = {
  apisidebar: [
    {
      type: "doc",
      id: "Workbook/ATM/ATM-example",
    },
    {
      type: "category",
      label: "Tag 1",
      items: [
        {
          type: "doc",
          id: "Workbook/ATM/Deposit",
          label: "Deposit",
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
        // {
        //   type: "category",
        //   label: "Tag 2",
        //   items: [
        //     {
        //       type: "doc",
        //       id: "restaurant/list-all-products",
        //       label: "List All Products",
        //       className: "api-method get",
        //     },
        //     {
        //       type: "doc",
        //       id: "restaurant/list-all-drinks",
        //       label: "List All Drinks",
        //       className: "api-method get",
        //     },
        //   ],
        // },
 ],
};

export default sidebar.apisidebar;
