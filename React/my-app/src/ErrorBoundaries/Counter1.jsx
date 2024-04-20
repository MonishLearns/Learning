import React, {useState} from "react";

const Counter1 = () => {
    const [counter1, updateCounter] = useState(0);
    if(counter1 === 5){
        throw new Error("I crashed");
    }
    return (
        <div>
            <h1>{counter1}</h1>
            <button onClick={() => {
                updateCounter(prevCount => prevCount+1);
            }}>click me</button>
        </div>
        
    )
}

export default Counter1;