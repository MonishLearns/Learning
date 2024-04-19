// What you have
var officers = [
    { id: 20, name: 'Captain Piett' },
    { id: 24, name: 'General Veers' },
    { id: 56, name: 'Admiral Ozzel' },
    { id: 88, name: 'Commander Jerjerrod' }
  ];
  // What you need
//   [20, 24, 56, 88]

// we can use forEach, for etc 

var officersIds = [];
officers.forEach(function (officer) {
  officersIds.push(officer.id);
});
console.log(officersIds); // [ 20, 24, 56, 88 ]

// The above work but we need to create a new array and then push values but we will see how easily we can use map to do same.

officersIds =  officers.map((officer) => {
    return officer.id;
})
console.log(officersIds); // [ 20, 24, 56, 88 ]

//So how does .map() work? Basically is takes 2 arguments, a callback and an optional context 
//(will be considered as this in the callback) which I did not use in the previous example. 
//The callback runs for each value in the array and returns each new value in the resulting array.

// Keep in mind that the resulting array will always be the same length as the original array.
