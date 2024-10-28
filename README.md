# MakeChangeProject

## Description
This program promopts the user for their <em>purchase cost</em> and <em>amount tendered</em> and calculates the <strong>amount of change due back</strong> in: 
<ul>
<li>twenty dollar bills,</li> 
<li>ten dollar bills, </li>
<li>five dollar bills,</li> 
<li>one dollar bills,</li>
<li>quarters,</li>
<li>dimes,</li>
<li>nickels,</li>
<li>and pennies.</li>
</ul>

## Technologies Used
<ul>
<li>Java</li>
<li>Eclipse</li>
<li>Sublime</li>
<li>Git/GitHub</li>
<li>Unix CommandLine</li>
<li>MacOS Terminal</li>
</ul>

## Lessons Learned
This project tested my math skills - specifically, the first example of 0.67 purchase price and 1.00 tendered was giving me 0.32 back instead of 0.33. I updated the <em>amountDue</em> calculation from <code>(int) ((tendered - purhase) * 100); </code> to <code>(int)((tendered * 100) - purchase * 100);</code> which fixed the problem.
<br>I considered adding <strong>methods</strong> for the different denominations but I found using <strong>if statements</strong> was easier for me. I ended up nesting <em>if</em> and <em>else</em> statements to account for single or multiple denominations so it printed out "one twenty dollar bill" instead of  "one twenty dollar bills."
<br>Overall I enjoyed this project and once I figured out the math calculations, it sort of fell into place.
