<script>

 function check_form()
  {
   if (document.getElementById('login').value=='')
    {
     alert('Please, enter user login!');
     return false;
    }

   if (document.getElementById('password').value=='')
    {
     alert('Please, enter user password!');
     return false;
    }

   return true;
  }

</script>

<form action="{PAGE_URL}" method="post" onsubmit="return check_form();">
 <table border="0">

  <tr>
   <td align="right">
    Login:
   </td>
   <td align="left">
    <input type="text" name="ul" id="login" />
   </td>
  </tr>

  <tr>
   <td align="right">
    Password:
   </td>
   <td align="left">
    <input type="password" name="up" id="password" />
   </td>
  </tr>

  <tr>
   <td align="right">
    &nbsp;
   </td>
   <td align="left">
    <input type="submit" name="ug" value="Go!" />
   </td>
  </tr>

 </table>
</form>

<br />

Please read <a href="eula.txt">Terms & Conditions</a>!