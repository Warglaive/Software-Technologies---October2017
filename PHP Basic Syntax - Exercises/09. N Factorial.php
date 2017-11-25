<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = floatval($_GET['num']);
    $result = $num;
    for ($i = 2; $i < $num; $i++) {
        $result *= $i;
    }
    echo $result;
}
?>
</body>
</html>