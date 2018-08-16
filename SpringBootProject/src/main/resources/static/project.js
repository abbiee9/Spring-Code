/**
 * 
 */
function checkpassword()
{
	
	var p1=document.getElementById("p1").value;
	var p2=document.getElementById("p2").value;

	var p3=document.getElementById("status");
	var p4=document.getElementById("submit");
	if(p1==p2)
		{
			p3.innerHTML="Password Matched";
			p3.style.color="green";
			p4.disabled = false;
		}
	else
		{
		p3.innerHTML="Password MisMatched";
		p3.style.color="red";
		}
}