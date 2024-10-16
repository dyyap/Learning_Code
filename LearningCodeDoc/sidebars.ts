/**
 * Creating a sidebar enables you to:
 - create an ordered group of docs
 - render a sidebar for each doc of that group
 - provide next/previous navigation

 The sidebars can be generated from the filesystem, or explicitly defined here.

 Create as many sidebars as you want.
 */

// @ts-check

/** @type {import('@docusaurus/plugin-content-docs').SidebarsConfig} */

import type {SidebarsConfig} from "@docusaurus/plugin-content-docs"
import {versionCrumb, versionSelector,} from "docusaurus-plugin-openapi-docs/lib/sidebars/utils";
import petstoreVersions from "./docs/Workbook/versions.json";
import WorkbookSidebar from "./docs/Workbook/sidebar"
const sidebars = {
  // By default, Docusaurus generates a sidebar from the docs folder structure
  tutorialSidebar: [
    {
      type: "html",
      value: `<p style="color: var(--ifm-color-secondary-darkest)">DOCUMENTATION</p>`, // The HTML to be rendered
      defaultStyle: true, // Use the default menu item styling
    },
    {
      type: "doc",
      id: "intro",
    },
    {
      type: "doc",
      id: "sidebars",
    },
    {
      type: "doc",
      id: "versioning",
    },
    {
      type: "category",
      label: "Customization",
      link: {
        type: "generated-index",
      },
      items: [
        {
          type: "autogenerated",
          dirName: "customization",
        },
      ],
    },
  ],
  Workbook: [
    {
      type: "html",
      defaultStyle: true,
      value: versionSelector(petstoreVersions),
      className: "version-button",
    },
    {
      type: "html",
      defaultStyle: true,
      value: versionCrumb(`v1.5.2`),
    },
    {
      type: "category",
      label: "Workbook",
      link: {
        type: "generated-index",
        title: "Workbook",
        description:
        "This is the workbook",
        slug: "/category/Workbook",
      },
      items: WorkbookSidebar,
    }
  ]


  // But you can create a sidebar manually
  /*
  tutorialSidebar: [
    'intro',
    'hello',
    {
      type: 'category',
      label: 'Tutorial',
      items: ['tutorial-basics/create-a-document'],
    },
  ],
   */
};

export default sidebars;
module.exports = sidebars;
