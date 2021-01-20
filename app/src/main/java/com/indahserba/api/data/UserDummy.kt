package com.indahserba.api.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User("JakeWharton",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharthon",
            "https://api.github.com/users/JakeWharthon/followers",
            10,
            "https://api.github.com/users/JakeWharthon/following{/other_user}",
            15,
            "https://api.github.com/users/JakeWharthon/repos",
            10
            ))

        list.add(User("JakeWharton2",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharthon",
            "https://api.github.com/users/JakeWharthon/followers",
            10,
            "https://api.github.com/users/JakeWharthon/following{/other_user}",
            15,
            "https://api.github.com/users/JakeWharthon/repos",
            10
        ))

        list.add(User("JakeWharton3",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharthon",
            "https://api.github.com/users/JakeWharthon/followers",
            10,
            "https://api.github.com/users/JakeWharthon/following{/other_user}",
            15,
            "https://api.github.com/users/JakeWharthon/repos",
            10
        ))

            return list
    }
}