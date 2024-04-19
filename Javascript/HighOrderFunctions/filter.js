// What if you have an array, but only want some of the elements in it? That’s where .filter() comes in!

var pilots = [
    {
      id: 2,
      name: "Wedge Antilles",
      faction: "Rebels",
    },
    {
      id: 8,
      name: "Ciena Ree",
      faction: "Empire",
    },
    {
      id: 40,
      name: "Iden Versio",
      faction: "Empire",
    },
    {
      id: 66,
      name: "Thane Kyrell",
      faction: "Rebels",
    }
  ];


  //Say we want two arrays now: one for rebel pilots, the other one for imperials. With .filter() it couldn’t be easier!
  var rebels = pilots.filter(function (pilot) {
    return pilot.faction === "Rebels";
  });
  var empire = pilots.filter(function (pilot) {
    return pilot.faction === "Empire";
  });
  console.log(rebels); // [{ id: 2, name: 'Wedge Antilles', faction: 'Rebels' }, { id: 66, name: 'Thane Kyrell', faction: 'Rebels' }]
  console.log(empire); // [{ id: 8, name: 'Ciena Ree', faction: 'Empire' },{ id: 40, name: 'Iden Versio', faction: 'Empire' }]

  //Basically, if the callback function returns true, the current element will be in the resulting array. If it returns false, it won’t be.
  // basicallu yoo will have a condition in the return if it return true that passed element will be in the answer