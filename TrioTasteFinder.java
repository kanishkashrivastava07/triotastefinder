import java.util.Scanner;
public class TrioTasteFinder{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String[][] ingredients = {
                {"Heavy cream", " Sweetened condensed milk", " Vanilla bean paste"},
                {"Rice Krispies cereal", " Butter", " Marshmallows"},
                {"Macaroni", " Cheese", " Milk"},
                {"Bananas", " Eggs", " Flour"},
                {"Bananas", " Eggs", " Yellow cake mix"},
                {"Mozzarella cheese", " Eggs", " Breadcrumbs"},
                {"Potatoes", " Cream", " Butter"},
                {"Canned whole tomatoes", " Onion", " Butter"},
                {"Butter", " Chili crisp", " Garlic"},
                {"Bread flour", " Water", " Yeast"},
                {"Nutella", " Ice cream", " Pretzels"},
                {"Flour tortilla", " Refried beans", " Cheese"},
                {"Bread", " Avocado", " Chili flakes"},
                {"Cinnamon Toast Crunch cereal", " Peanut butter", " Honey"},
                {"Fettucine pasta", " Butter", " Parmesan cheese"},
                {"Self-rising flour", " Cream", " Butter"},
                {"Nutella", " Flour", " Eggs"},
                {"Popcorn kernels", " Oil", " Sugar"},
                {"Potatoes", " Canola oil", " Salt"},
                {"Flour", " Sugar", " Butter"},
                {"Flour", " Oil", " Water"},
                {"Peanut butter", " Jelly", " Bread"},
                {"Tortilla", " Cheese", " Butter"},
                {"Puff pastry", " Strawberries", " Sugar"},
                {"Tomatoes", " Mozzarella", " Basil"},
                {"Cabbage", " Garlic", " Lemon"},
                {"Noodles", " Butter", " Parmesan cheese"},
                {"Eggs", " Cheese", " Butter"},
                {"Hazelnuts", " Sugar", " Water"},
                {"Cornmeal", " Water", " Salt"},
                {"Bread", " Tomatoes", " Olive oil"},
                {"Bread", " Cheese", " Butter"},
                {"Blackberries", " Sugar", " Lemon juice"},
                {"Potatoes", " Eggs", " Oil"},
                {"Pizza dough", " Tomato sauce", " Mozzarella cheese"},
                {"Nutella", " Eggs", " Flour"},
                {"Peanut butter", " Sugar", " Egg"},
                {"Pasta", " Garlic", " Olive oil"}
        };

        String[] instructions = {
                "You can make Ice Cream -> Whip heavy cream until thick, gently fold in sweetened condensed milk and vanilla, pour into a container, and freeze until solid. Scoop and serve for a creamy homemade ice cream.",
                "You can make Rice Krispy Treats -> Melt butter and marshmallows in a pan, then mix in the Rice Krispies cereal to coat well. Press the mixture into a tray, let cool, and cut into fun squares.",
                "You can make Mac and Cheese -> Boil macaroni until tender, drain it, and stir in the cheese and milk over low heat until the sauce is creamy and everything is well combined.",
                "You can make Pancakes -> Mash the bananas, mix in eggs and flour until you have a batter, and cook the pancakes on a hot pan until golden on both sides.",
                "You can make Banana Bread -> Combine mashed bananas with eggs and yellow cake mix, pour into a loaf pan, and bake until firm. Banana bread is ready when a toothpick in the center comes out clean.",
                "You can make Mozzarella Sticks -> Cut mozzarella cheese into sticks, dip them in beaten egg, then coat with breadcrumbs before frying until they're crisp and golden.",
                "You can make Mashed Potatoes -> Boil potatoes until soft, then mash them with cream and butter for a smooth and rich side dish.",
                "You can make Tomato Soup -> Cook onions in butter until soft, add canned tomatoes and simmer, then blend everything for a smooth, comforting tomato soup.",
                "You can make Spicy Chili Crisp Butter -> Soften the butter, stir in minced garlic and chili crisp, and use this spicy butter as a delicious spread or topping.",
                "You can make Crusty Bread -> Mix bread flour, water, and yeast to form a dough, let rise, shape into a loaf, and bake at high heat until crusty and golden.",
                "You can make Nutella Pretzel Milkshake -> Blend Nutella, ice cream, and crushed pretzels for a sweet, creamy milkshake you can top with extra pretzel pieces.",
                "You can make Bean & Cheese Burrito -> Warm refried beans and cheese, spoon into a tortilla, roll up, and heat until soft and melty for a quick burrito.",
                "You can make Spicy Avocado Toast -> Toast bread, spread mashed avocado on top, and finish with chili flakes for a spicy and creamy snack.",
                "You can make Peanut Butter Cinnamon Toast Crunch Bites -> Mix cereal with peanut butter and honey, shape into small balls, and chill until firm for easy bites.",
                "You can make Fettucine Al Burro -> Cook fettucine until al dente, drain, and toss with butter and parmesan cheese for a silky pasta dish.",
                "You can make Biscuits -> Mix self-rising flour and cream to make a dough, shape into biscuits, add a bit of butter on top, and bake until golden.",
                "You can make Brownie Cookies -> Stir together Nutella, flour, and eggs for an easy batter, then bake spoonfuls into rich brownie cookies.",
                "You can make Kettle Corn -> Heat oil in a deep pot, add popcorn kernels and sugar, cover and shake until popping slows. Cool for a sweet and crunchy treat.",
                "You can make Potato Chips -> Slice potatoes thinly, toss with oil and salt, and bake or fry until crisp for homemade chips.",
                "You can make Sugar Cookies -> Mix softened butter, sugar, and flour to form a dough, shape cookies, and bake until the edges are golden.",
                "You can make Tortillas -> Combine flour, oil, and water to form a dough, roll it out, and cook tortillas on a hot pan until lightly browned.",
                "You can make PB & J -> Spread peanut butter and jelly on bread slices, press together, and slice your classic sandwich.",
                "You can make Quesadilla -> Sprinkle cheese and butter between tortillas and cook on a hot pan until the cheese is melted and the outside is crisp.",
                "You can make Strawberry Tart -> Lay puff pastry on a tray, top with strawberries and sugar, then bake until the pastry is golden and flaky.",
                "You can make Caprese Salad -> Slice tomatoes and mozzarella, layer with basil leaves, and drizzle with olive oil for a light salad.",
                "You can make Garlic Lemony Cabbage -> Chop cabbage, sauté with garlic, then finish with fresh lemon juice for a zesty stir-fry.",
                "You can make Buttered Noodles -> Cook noodles, then toss with melted butter and parmesan cheese for quick comfort food.",
                "You can make Omelette au Fromage -> Beat eggs, pour into a pan with melted butter, sprinkle cheese on top, fold, and cook until set for a cheesy omelette.",
                "You can make Hazelnut Praline -> Boil sugar and water until golden, add hazelnuts, pour out to cool, then break into crunchy praline pieces.",
                "You can make Corn Pone -> Mix cornmeal, water, and salt to form a thick batter. Shape, bake or fry cakes until golden and set.",
                "You can make Pan con Tomato -> Toast bread slices, rub cut tomato on top, and finish with a drizzle of olive oil.",
                "You can make Grilled Cheese -> Layer cheese between slices of bread, butter outside, and fry in a pan until the bread is golden and cheese is gooey.",
                "You can make Blackberry Jam -> Cook blackberries with sugar and lemon juice until thick, cool, and enjoy homemade jam.",
                "You can make Spanish Tortilla -> Fry sliced potatoes in oil until tender, then add beaten eggs, cook gently, and flip once to set for a classic Spanish tortilla.",
                "You can make Pizza -> Roll out pizza dough, spread tomato sauce and mozzarella cheese, and bake at high heat until bubbly and golden.",
                "You can make Nutella Brownies -> Mix Nutella, eggs, and flour into a batter, spread into a pan, and bake until firm for quick brownies.",
                "You can make Peanut Butter Cookies -> Combine peanut butter, sugar, and egg, shape into balls, and bake for easy cookies.",
                "You can make Garlic Oil Pasta -> Boil pasta, sauté garlic in olive oil, toss pasta with garlic oil, and serve hot."
        };

        for(int i = 0; i < ingredients.length; i++){
            System.out.println((i + 1) + " " + ingredients[i][0] + ingredients[i][1] + ingredients[i][2]);
        }
        System.out.println("Choose the three ingredients you have: ");
        System.out.println("Choose from (1 - " + ingredients.length + ") : ");
        int input = scn.nextInt();

        if(input >= 1 && input <= ingredients.length){
         System.out.println(instructions[input - 1]);
        }else{
            System.out.println("Invalid number please enter between (1 - " + ingredients.length + "): ");
        }
    }
}
