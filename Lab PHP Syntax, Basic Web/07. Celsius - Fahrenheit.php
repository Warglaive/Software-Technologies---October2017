<form>
    Celsius: <input type="text" name="cel"/>
    <input type="submit" value="Convert">
    <?php
    $celsius = floatval($_GET['cel']);
    $fahrenheit = $celsius * 1.8 + 32;
    echo $celsius . "&deg;C = " . $fahrenheit . "&deg;F";
    ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah"/>
    <input type="submit" value="Convert">
    <?php
    $currentFahren = floatval($_GET['fah']);
    $currentCel = ($currentFahren - 32) * 5 / 9;
    echo $currentFahren . "&deg;F = " . $currentCel . "&deg;C";
    ?>
</form>

