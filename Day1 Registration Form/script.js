function submit(){
  const name=document.forms["regcontainer"]["uname"].value;
  const email=document.forms["regcontainer"]["uemail"].value;
  const password=document.forms["regcontainer"]["upassword"].value;
  const gender=document.querySelector('input[name="ugender"]:checked');
  const address=document.forms["regcontainer"]["uaddress"].value;
  const phnNum=document.forms["regcontainer"]["uphnNum"].value;

  if(name.trim()==''){
      alert('Enter full name');
      return;
  }
  const emailRegex=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if(!emailRegex.test(email)){
      alert('Enter valid email address');
      return;
  }
  if(password.length<8){
      alert('Password must be atleast 8 characters long');
      return;
  }
  if(!gender){
      alert('Select a gender');
      return;
  }
  if(address.trim()==''){
      alert('Enter your address');
      return;
  }
  const phnRegex=/^\d{10}$/;
  if(!phnRegex.test(phnNum)){
      alert('Enter valid number');
      return;
  }

  console.log('Form submitted successfully');
  console.log('Name ',name);
  console.log('Email ',email);
  console.log('Password ',password);
  console.log('Gender ',gender.value);
  console.log('Address ',address);
  console.log('Phone Number ',phnNum);
}