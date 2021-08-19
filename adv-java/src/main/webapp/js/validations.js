// var lEmail = $("#login-email").val();
// let lpass = document.getElementById("login-password");

// console.log("lEmail");


// lEmail.addEventListener("blur", () => {
//     // console.log("Email is blurred");
    
//     // let regex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
//     let regex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@gmail.com*$/;
//     let str = lEmail.value;
//     // console.log(regex, str);
//     if (regex.test(str)) {
//       console.log("Your Email is valid");
//       lEmail.classList.remove("is-invalid");
//       valdemail = true;
//     } else {
//       console.log("Your Email is not valid");
//       lEmail.classList.add("is-invalid");
//       valdemail = false;
//     }
//   });



// $(function () {
//         $("#login-input").keyup(function () {
//             check_log_email();
//         });

//         function check_log_email() {
//             var pattern = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
//             var email = $("#login-input").val();
//             if (email == '') {
//                 $("#login-input-error").hide();
//             } else if (pattern.test(email) && email !== '') {
//                 $("#login-input-error").hide();
//             } else {
//                 $("#login-input-error").html("Invalid Email");
//                 $("#login-input-error").show();
//                 $("#login-input-error").css("color", " #F90A0A");
//                 $("#login-input-error").css("font-size", "10px");
//             }
//         }

//     });