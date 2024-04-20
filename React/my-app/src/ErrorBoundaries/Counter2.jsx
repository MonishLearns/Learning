import React, {useState} from "react";

const Counter2 = () => {
    const [counter2, updateCounter] = useState(0);
    return (
        <div>
            <h1>{counter2}</h1>
            <button onClick={() => {
                updateCounter(prevCount => prevCount+1);
            }}>click me</button>
        </div>
        
    )
}

export default Counter2;