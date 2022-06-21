<?php
echo 'ini: ', get_cfg_var('cfg_file_path');
$host = "localhost";
$user = "root";
$pass = "";
$database = "dataonline";

$conn = mysqli_connect($host, $user, $pass, $database);
mysqli_set_charset($conn, "utf8")
?>