Feature: New Jobs

  Scenario Outline: run a test to validate jobs
    Given job is running and available for <METHOD>
    When when we send a request for <API> and <STATUS> and requested operation is <METHOD> and action is <ACTION>
    Then response code is <ACTION> is <STATUS>

#    Examples: oauth
#      |API      |STATUS     |RESPONSE       |METHOD       |ACTION     |
#      |oauth    |200        |OK             |post          | oath_authrization  |
#      |oauth    |400        |OK             |post          | accessToken  |
#      |oauth    |404        |OK             |post          | accessToken_refresh  |


    Examples: users
      |API      |STATUS     |RESPONSE       |METHOD       |ACTION     |
      |users    |200        |OK             |get          | get_user  |
#      |users    |200        |OK             |get          | get_user_tiles  |
#      |users    |404        |OK             |GET          | GET_TILES_NO_TILES  |
#      |users    |500        |OK             |GET          | GET_TILES  |


    Examples: tiles
#      |API      |STATUS     |RESPONSE       |METHOD       |ACTION     |
#      |tiles    |200        |OK             |get          | get_tiles  |
#      |users    |200        |OK             |GET          | GET_TILES  |
#      |users    |404        |OK             |GET          | GET_TILES_NO_TILES  |
#      |users    |500        |OK             |GET          | GET_TILES_NO_END_POINT  |

#    Examples: RefreshToken
#      |API      |STATUS     |RESPONSE       |METHOD       |ACTION     |
#      |users    |200        |OK             |GET          | TOKEN_REFRESH  |
#      |users    |401        |OK             |GET          | TOKEN_REFRESH_NEGATIVE  |
#      |users    |404        |OK             |GET          | TOKEN_REFRESH_EXPIREDTOKEN  |
#      |users    |500        |OK             |GET          | TOKEN_REFRESH_SERVER_DOWN  |