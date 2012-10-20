/**
 * OOSE Project - Group 4
 * User.java
 */
package edu.jhu.twacker.model.query.twitter.tweet;

/**
 * This class represents a Twitter user. The structure of the class is defined
 * by the Twitter Streaming API's JSON format.
 * 
 * The full documentation: {@link https://dev.twitter.com/docs/platform-objects/users}
 * 
 * @author Daniel Deutsch
 */
public class User
{
	/**
	 * Indicates whether or not the user has an account with "contributor mode," which
	 * is rarely true.
	 */
	private boolean contributors_enabled;
	
	/**
	 * The UTC datetime when the user account was created.
	 */
	private String created_at;
	
	/**
	 * Indicates that the user has not altered the theme or background of
	 * their user profile.
	 */
	private boolean default_profile;
	
	/**
	 * Indicates if the user has uploaded their own profile picture.
	 */
	private boolean default_profile_image;
	
	/**
	 * The String describing the user's account.
	 */
	private String description;
	
	/**
	 * The entities which have been parsed out of the url or description
	 * fields defined by the user.
	 */
	private UserEntities entities;
	
	/**
	 * The number of Tweets this user has favorited in the account's lifetime.
	 * Note the British spelling.
	 */
	private int favourites_count;
	
	/**
	 * Indicates whether or not a user has issued a follow request 
	 * to this protected user account.
	 */
	private boolean follow_request_sent;
	
	/**
	 * Indicates that the authenticating user is following this user.
	 */
	private boolean following;
	
	/**
	 * The number of followers.
	 */
	private int followers_count;
	
	/**
	 * The number of users this account is following.
	 */
	private int friends_count;
	
	/**
	 * Indicates whether or not the user has the possibility of geotagging
	 * their Tweets.
	 */
	private boolean geo_enabled;
	
	/**
	 * The unique id of the user.
	 */
	private long id;
	
	/**
	 * The unique id of the user as a String.
	 */
	private String id_str;
	
	/**
	 * Indicates whether or not this user is a participant in the translator community.
	 */
	private boolean is_translator;
	
	/**
	 * The language of the user.
	 */
	private String lang;
	
	/**
	 * The number of public lists that this user is a member of.
	 */
	private int listed_count;
	
	/**
	 * The user-defined location of the account's profile.
	 */
	private String location;
	
	/**
	 * The name of this user as they have defined it.
	 */
	private String name;
	
	/**
	 * Indicates whether or not the authenticated user has chosen
	 * to receive this user's Tweets by SMS.
	 */
	private boolean notifications;
	
	/**
	 * The hexadecimal color chosen by the user for their background.
	 */
	private String profile_background_color;
	
	/**
	 * The url pointing to the background image chosen by the user.
	 */
	private String profile_background_image_url;
	
	/**
	 * The url pointing to the background image chosen by the user.
	 */
	private String profile_background_image_url_https;
	
	/**
	 * Indicates whether or not the user's background should be tiled.
	 */
	private boolean profile_background_tile;
	
	/**
	 * The url pointing to the web representation of the 
	 * user's uploaded profile banner.
	 */
	private String profile_banner_url;
	
	/**
	 * The url pointing to the user's avatar image.
	 */
	private String profile_image_url;
	
	/**
	 * The url pointing the user's avatar image.
	 */
	private String profile_image_url_https;
	
	/**
	 * The hexadecimal color the user has chosen to display links 
	 * within their Twitter UI.
	 */
	private String profile_link_color;
	
	/**
	 * The hexadecimal color the user has chosen to display
	 * sidebar borders.
	 */
	private String profile_sidebar_border_color;
	
	/**
	 * The hexadecimal color the user has chosen to display
	 * sidebar backgrounds.
	 */
	private String profile_sidebar_fill_color;
	
	/**
	 * The hexadecimal color the user has chosen to display text within
	 * their Twitter UI.
	 */
	private String profile_text_color;
	
	/**
	 * Indicates if the user wants their uploaded background image to be used.
	 */
	private boolean profile_use_background_image;
	
	/**
	 * The screen name of the user.
	 */
	private String screen_name;
	
	/**
	 * Indicates if the user would like to see media inline.
	 */
	private boolean show_all_inline_media;
	
	/**
	 * The user's most recent Tweet or retweet.
	 */
	private Tweet status;
	
	/**
	 * THe number of Tweets issued by the user.
	 */
	private int statuses_count;
	
	/**
	 * The time zone this user declares.
	 */
	private String time_zone;
	
	/**
	 * The url provided by the user in association with their profile.
	 */
	private String url;
	
	/**
	 * The offset from GMT/UTC in seconds.
	 */
	private int utc_offset;
	
	/**
	 * Indicates whether or not this user account has been verified.
	 */
	private boolean verified;
	
	/**
	 * Indicates the two letter country codes where this user is withheld from.
	 */
	private String withheld_in_countries;
	
	/**
	 * Indicates whether the content being withheld is the user or the content.
	 */
	private String withheld_scope;

	/**
	 * The empty constructor.
	 */
	public User()
	{
		
	}
	
	/**
	 * Retrieves the contributors_enabled of the object.
	 * @return The contributors_enabled.
	 */
	public boolean isContributors_enabled()
	{
		return this.contributors_enabled;
	}

	/**
	 * Retrieves the created_at of the object.
	 * @return The created_at.
	 */
	public String getCreated_at()
	{
		return this.created_at;
	}

	/**
	 * Retrieves the default_profile of the object.
	 * @return The default_profile.
	 */
	public boolean isDefault_profile()
	{
		return this.default_profile;
	}

	/**
	 * Retrieves the default_profile_image of the object.
	 * @return The default_profile_image.
	 */
	public boolean isDefault_profile_image()
	{
		return this.default_profile_image;
	}

	/**
	 * Retrieves the description of the object.
	 * @return The description.
	 */
	public String getDescription()
	{
		return this.description;
	}

	/**
	 * Retrieves the entities of the object.
	 * @return The entities.
	 */
	public UserEntities getEntities()
	{
		return this.entities;
	}

	/**
	 * Retrieves the favourites_count of the object.
	 * @return The favourites_count.
	 */
	public int getFavourites_count()
	{
		return this.favourites_count;
	}

	/**
	 * Retrieves the follow_request_sent of the object.
	 * @return The follow_request_sent.
	 */
	public boolean isFollow_request_sent()
	{
		return this.follow_request_sent;
	}

	/**
	 * Retrieves the following of the object.
	 * @return The following.
	 */
	public boolean isFollowing()
	{
		return this.following;
	}

	/**
	 * Retrieves the followers_count of the object.
	 * @return The followers_count.
	 */
	public int getFollowers_count()
	{
		return this.followers_count;
	}

	/**
	 * Retrieves the friends_count of the object.
	 * @return The friends_count.
	 */
	public int getFriends_count()
	{
		return this.friends_count;
	}

	/**
	 * Retrieves the geo_enabled of the object.
	 * @return The geo_enabled.
	 */
	public boolean isGeo_enabled()
	{
		return this.geo_enabled;
	}

	/**
	 * Retrieves the id of the object.
	 * @return The id.
	 */
	public long getId()
	{
		return this.id;
	}

	/**
	 * Retrieves the id_str of the object.
	 * @return The id_str.
	 */
	public String getId_str()
	{
		return this.id_str;
	}

	/**
	 * Retrieves the is_translator of the object.
	 * @return The is_translator.
	 */
	public boolean isIs_translator()
	{
		return this.is_translator;
	}

	/**
	 * Retrieves the lang of the object.
	 * @return The lang.
	 */
	public String getLang()
	{
		return this.lang;
	}

	/**
	 * Retrieves the listed_count of the object.
	 * @return The listed_count.
	 */
	public int getListed_count()
	{
		return this.listed_count;
	}

	/**
	 * Retrieves the location of the object.
	 * @return The location.
	 */
	public String getLocation()
	{
		return this.location;
	}

	/**
	 * Retrieves the name of the object.
	 * @return The name.
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Retrieves the notifications of the object.
	 * @return The notifications.
	 */
	public boolean isNotifications()
	{
		return this.notifications;
	}

	/**
	 * Retrieves the profile_background_color of the object.
	 * @return The profile_background_color.
	 */
	public String getProfile_background_color()
	{
		return this.profile_background_color;
	}

	/**
	 * Retrieves the profile_background_image_url of the object.
	 * @return The profile_background_image_url.
	 */
	public String getProfile_background_image_url()
	{
		return this.profile_background_image_url;
	}

	/**
	 * Retrieves the profile_background_image_url_https of the object.
	 * @return The profile_background_image_url_https.
	 */
	public String getProfile_background_image_url_https()
	{
		return this.profile_background_image_url_https;
	}

	/**
	 * Retrieves the profile_background_tile of the object.
	 * @return The profile_background_tile.
	 */
	public boolean isProfile_background_tile()
	{
		return this.profile_background_tile;
	}

	/**
	 * Retrieves the profile_banner_url of the object.
	 * @return The profile_banner_url.
	 */
	public String getProfile_banner_url()
	{
		return this.profile_banner_url;
	}

	/**
	 * Retrieves the profile_image_url of the object.
	 * @return The profile_image_url.
	 */
	public String getProfile_image_url()
	{
		return this.profile_image_url;
	}

	/**
	 * Retrieves the profile_image_url_https of the object.
	 * @return The profile_image_url_https.
	 */
	public String getProfile_image_url_https()
	{
		return this.profile_image_url_https;
	}

	/**
	 * Retrieves the profile_link_color of the object.
	 * @return The profile_link_color.
	 */
	public String getProfile_link_color()
	{
		return this.profile_link_color;
	}

	/**
	 * Retrieves the profile_sidebar_border_color of the object.
	 * @return The profile_sidebar_border_color.
	 */
	public String getProfile_sidebar_border_color()
	{
		return this.profile_sidebar_border_color;
	}

	/**
	 * Retrieves the profile_sidebar_fill_color of the object.
	 * @return The profile_sidebar_fill_color.
	 */
	public String getProfile_sidebar_fill_color()
	{
		return this.profile_sidebar_fill_color;
	}

	/**
	 * Retrieves the profile_text_color of the object.
	 * @return The profile_text_color.
	 */
	public String getProfile_text_color()
	{
		return this.profile_text_color;
	}

	/**
	 * Retrieves the profile_use_background_image of the object.
	 * @return The profile_use_background_image.
	 */
	public boolean isProfile_use_background_image()
	{
		return this.profile_use_background_image;
	}

	/**
	 * Retrieves the screen_name of the object.
	 * @return The screen_name.
	 */
	public String getScreen_name()
	{
		return this.screen_name;
	}

	/**
	 * Retrieves the show_all_inline_media of the object.
	 * @return The show_all_inline_media.
	 */
	public boolean isShow_all_inline_media()
	{
		return this.show_all_inline_media;
	}

	/**
	 * Retrieves the status of the object.
	 * @return The status.
	 */
	public Tweet getStatus()
	{
		return this.status;
	}

	/**
	 * Retrieves the statuses_count of the object.
	 * @return The statuses_count.
	 */
	public int getStatuses_count()
	{
		return this.statuses_count;
	}

	/**
	 * Retrieves the time_zone of the object.
	 * @return The time_zone.
	 */
	public String getTime_zone()
	{
		return this.time_zone;
	}

	/**
	 * Retrieves the url of the object.
	 * @return The url.
	 */
	public String getUrl()
	{
		return this.url;
	}

	/**
	 * Retrieves the utc_offset of the object.
	 * @return The utc_offset.
	 */
	public int getUtc_offset()
	{
		return this.utc_offset;
	}

	/**
	 * Retrieves the verified of the object.
	 * @return The verified.
	 */
	public boolean isVerified()
	{
		return this.verified;
	}

	/**
	 * Retrieves the withheld_in_countries of the object.
	 * @return The withheld_in_countries.
	 */
	public String getWithheld_in_countries()
	{
		return this.withheld_in_countries;
	}

	/**
	 * Retrieves the withheld_scope of the object.
	 * @return The withheld_scope.
	 */
	public String getWithheld_scope()
	{
		return this.withheld_scope;
	}
}
