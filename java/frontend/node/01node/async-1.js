// function displayA() {
//     console.log('A');
//     }
// function displayB() {
//     setTimeout(()=>{
//         console.log('B');
//     },2000);
//     }
// function displayC() {
//     console.log('C');
//     }
// displayA();
// displayB();
// displayC();


function displayA() {
    console.log('A');
  }
  
  function displayB(callback) {
    setTimeout(() => {
      console.log('B');
      callback(); // B가 출력된 후에 C 실행
    }, 2000);
  }
  
  function displayC() {
    console.log('C');
  }
  
  displayA();
  displayB(displayC);
  