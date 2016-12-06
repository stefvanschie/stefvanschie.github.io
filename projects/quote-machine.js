//quotes from https://litemind.com/best-famous-quotes/

var quotes = [
  "You can do anything, but not everything.<br /><i> - David Allen</i>",
  "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.<br /><i> - Antoine de Saint-Exupéry</i>",
  "The richest man is not he who has the most, but he who needs the least.",
  "You miss 100 percent of the shots you never take.<br /><i> - Wayne Gretzky</i>",
  "Courage is not the absence of fear, but rather the judgement that something else is more important than fear.<br /><i> - Ambrose Redmoon</i>",
  "You must be the change you wish to see in the world.<br /><i> - Gandhi</i>",
  "When hungry, eat your rice; when tired, close your eyes. Fools may laugh at me, but wise men will know what I mean.<br /><i> - Lin-Chi</i>",
  "The third-rate mind is only happy when it is thinking with the majority. The second-rate mind is only happy when it is thinking with the minority. The first-rate mind is only happy when it is thinking.<br /><i> - A. A. Milne</i>",
  "To the man who only has a hammer, everything he encounters begins to look like a nail.<br /><i> - Abraham Maslow</i>",
  "We are what we repeatedly do; excellence, then, is not an act but a habit.<br /><i> - Aristotle</i>",
  "A wise man gets more use from his enemies than a fool from his friends.<br /><i> - Baltasar Gracian</i>",
  "Do not seek to follow in the footsteps of the men of old; seek what they sought.<br /><i> - Basho</i>",
  "Watch your thoughts; they become words.<br />Watch your words; they become actions.<br />Watch your actions; they become habits.<br />Watch your habits; they become character.<br />Watch your character; it becomes your destiny.<br /><i> - Lao-Tze</i>",
  "Everyone is a genius at least once a year. The real geniuses simply have their bright ideas closer together.<br /><i> - Georg Christoph Lichtenberg</i>",
  "What we think, or what we know, or what we believe is, in the end, of little consequence. The only consequence is what we do.<br /><i> - John Ruskin</i>",
  "The real voyage of discovery consists not in seeking new lands but seeing with new eyes.<br /><i> - Marcel Proust</i>",
  "Work like you don’t need money, love like you’ve never been hurt, and dance like no one’s watching",
  "Try a thing you haven’t done three times. Once, to get over the fear of doing it. Twice, to learn how to do it. And a third time, to figure out whether you like it or not.<br /><i> - Virgil Garnett Thomson</i>",
  "Even if you’re on the right track, you’ll get run over if you just sit there.<br /><i> - Will Rogers</i>",
  "People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily.<br /><i> - Zig Ziglar</i>",
  "Before I got married I had six theories about bringing up children; now I have six children and no theories.<br /><i> - John Wilmot</i>",
  "What the world needs is more geniuses with humility, there are so few of us left.<br /><i> - Oscar Levant</i>",
  "Always forgive your enemies; nothing annoys them so much.<br /><i> - Oscar Wilde</i>",
  "I’ve gone into hundreds of [fortune-teller’s parlors], and have been told thousands of things, but nobody ever told me I was a policewoman getting ready to arrest her.<br /><i> - New York City detective</i>",
  "When you go into court you are putting your fate into the hands of twelve people who weren’t smart enough to get out of jury duty.<br /><i> - Norm Crosby</i>",
  "Those who believe in telekinetics, raise my hand.<br /><i> - Kurt Vonnegut</i>",
  "Just the fact that some geniuses were laughed at does not imply that all who are laughed at are geniuses. They laughed at Columbus, they laughed at Fulton, they laughed at the Wright brothers. But they also laughed at Bozo the Clown.<br /><i> - Carl Sagan</i>",
  "My pessimism extends to the point of even suspecting the sincerity of the pessimists.<br /><i> - Jean Rostand</i>",
  "Sometimes I worry about being a success in a mediocre world.<br /><i> - Lily Tomlin</i>",
  "I quit therapy because my analyst was trying to help me behind my back.<br /><i> - Richard Lewis</i>",
  "We’ve heard that a million monkeys at a million keyboards could produce the complete works of Shakespeare; now, thanks to the Internet, we know that is not true.<br /><i> - Robert Wilensky</i>",
  "If there are no stupid questions, then what kind of questions do stupid people ask? Do they get smart just in time to ask questions?<br /><i> - Scott Adams</i>",
  "If the lessons of history teach us anything it is that nobody learns the lessons that history teaches us.<br /><i> - Anon</i>",
  "When I was a boy I was told that anybody could become President. Now I’m beginning to believe it.<br /><i> - Clarence Darrow</i>",
  "Laughing at our mistakes can lengthen our own life. Laughing at someone else’s can shorten it.<br /><i> - Cullen Hightower</i>",
  "There are many who dare not kill themselves for fear of what the neighbors will say.<br /><i> - Cyril Connolly</i>",
  "There’s so much comedy on television. Does that cause comedy in the streets?<br /><i> - Dick Cavett</i>",
  "All men are frauds. The only difference between them is that some admit it. I myself deny it.<br /><i> - H. L. Mencken</i>",
  "I don’t mind what Congress does, as long as they don’t do it in the streets and frighten the horses.<br /><i> - Victor Hugo</i>",
  "I took a speed reading course and read ‘War and Peace’ in twenty minutes. It involves Russia.<br /><i> - Woody Allen</i>",
  "The person who reads too much and uses his brain too little will fall into lazy habits of thinking.<br /><i> - Albert Einstein</i>",
  "Believe those who are seeking the truth. Doubt those who find it.<br /><i> - André Gide</i>",
  "It is the mark of an educated mind to be able to entertain a thought without accepting it.<br /><i> - Aristotle</i>",
  "I’d rather live with a good question than a bad answer.<br /><i> - Aryeh Frimer</i>",
  "We learn something every day, and lots of times it’s that what we learned the day before was wrong.<br /><i> - Bill Vaughan</i>",
  "I have made this letter longer than usual because I lack the time to make it shorter.<br /><i> - Blaise Pascal</i>"
];

$(document).ready(function() {
  $("#quote").html(quotes[Math.floor(Math.random() * quotes.length)]);
  
  $("button").click(function() {
     $("#quote").html(quotes[Math.floor(Math.random() * quotes.length)]);
  });
});
