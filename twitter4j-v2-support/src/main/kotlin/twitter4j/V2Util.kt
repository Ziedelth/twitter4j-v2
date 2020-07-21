package twitter4j

object V2Util {

    fun collectPolls(includes: JSONObject?): HashMap<Long, String> {

        val pollsMap = HashMap<Long, String>()

        includes?.optJSONArray("polls")?.let { polls ->
            for (i in 0 until polls.length()) {
                val pollString = polls.getString(i)
                pollsMap[polls.getJSONObject(i).getLong("id")] = pollString
            }
        }


        return pollsMap
    }

    fun collectUsers(includes: JSONObject?): HashMap<Long, User2> {

        val usersMap = HashMap<Long, User2>()

        includes?.optJSONArray("users")?.let { users ->
            for (i in 0 until users.length()) {
                val user = User2.parse(users.getJSONObject(i))
                usersMap[user.id] = user
            }
        }

        return usersMap
    }

}
