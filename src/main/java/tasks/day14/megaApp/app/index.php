<?php

header("Content-type: text/html;charset=utf-8");

if (sizeof($_POST)!=0){

	$link = mysqli_connect("127.0.0.1", "megaapp_user", "megaapp_app_user_pwd", "megaapp");

	if (!$link) {
		echo "ERROR: " . mysqli_connect_error() . mysqli_connect_errno() . "<br>";
		exit;
	}
	
	$ul = mysqli_real_escape_string ($link, $_POST["ul"]);
	$up = sha1($_POST["up"]);
	
	$r = mysqli_query($link, "SELECT * from `users` where `user_login`='$ul' AND `user_password`='$up' limit 1");
	
	if (mysqli_num_rows($r)==1) {
		echo 'OK';
	} else {
		echo 'ERROR';
	}
	
	mysqli_close($link);
	
} else {
	$form = file_get_contents('form.tpl');
	$form = str_replace('{PAGE_URL}', $_SERVER['PHP_SELF'], $form);
	echo $form;
}

?>