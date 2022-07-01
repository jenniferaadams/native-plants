import home from "./home.js";
import header from "./header.js";

const containerEl = document.querySelector(".container");
function makeHomeView() {
    containerEl.innerHTML = header();

}

makeHomeView();