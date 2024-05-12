import React, {useEffect, useLayoutEffect, useState} from "react"; 


const CheckUseEffect = () => {
    const [height, setHeight ] = useState(100);
    // useEffect(() => {
    //    setHeight(200);
    // },[]); // we will see some glitch here
    useLayoutEffect(() => {
        setHeight(200);
    },[]); // you will not see any glitch here

    return(
        <div style={{background:"red", height:`${height}px`}}>
            <h1>monishreddybs</h1>
        </div>
    )
}

/* 
why we see glitch when using useEffect and not see any glitch using useLayoutEffect ?
useEffect code runs asynchronously that means painting the UI happens and then useEffect code will be run
useLayoutEffect code runs synchrnously that means the logic inside useLayoutEffect runs first and then painting will happen.

remembering re rendering on state update and updating the dom happens before all of this
*/

export default CheckUseEffect;