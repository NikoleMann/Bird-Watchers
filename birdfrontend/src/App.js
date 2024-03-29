import React from "react";
import Navbar from "./components/Navbar";
import Hotspots from "./pages/hotspots";
import MyBirds from "./pages/mybirds";
import OtherBirders from "./pages/otherbirders";
import SearchDatabase from "./pages/search";
import Home from "./pages/home";


function App() {
    let component
    switch (window.location.pathname) {
    case "/":
        component = <Home />
        break
    case "/hotspots":
        component = <Hotspots />
        break
    case "/mybirds":
        component = <MyBirds />
        break
    case "/otherbirders":
        component = <OtherBirders />
        break
    case "/search":
        component = <SearchDatabase />
        break
    }
    return (
    <>
        <Navbar/>
        {component}
    </>
    )
}

export default App;
