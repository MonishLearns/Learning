//Just like .map(), .reduce() also runs a callback for each element of an array. 
//What’s different here is that reduce passes the result of this callback (the accumulator) from one array element to the other.

var pilots = [
    {
      id: 10,
      name: "Poe Dameron",
      years: 14,
    },
    {
      id: 2,
      name: "Temmin 'Snap' Wexley",
      years: 30,
    },
    {
      id: 41,
      name: "Tallissan Lintra",
      years: 16,
    },
    {
      id: 99,
      name: "Ello Asty",
      years: 22,
    }
  ];

// i want to find the total years of experience of all of them.
const initialValue =0;
var totalyears = pilots.reduce((accumulator, pilot) => {
    return accumulator + pilot.years;
},initialValue);
console.log(totalyears); // 82


//Now let’s say I want to find which pilot is the most experienced one. For that, I can use reduce as well:
const initial = {};
const mostExperienced = pilots.reduce((oldest, pilot) => {
    return (oldest.years || 0) > pilot.years ? oldest : pilot
},initial)
console.log(mostExperienced); // { id: 2, name: "Temmin 'Snap' Wexley", years: 30 }

// Basically if you want to get a single value from the array we can use reduce 
// simple examples would be finding max, min, and sum of an array.
