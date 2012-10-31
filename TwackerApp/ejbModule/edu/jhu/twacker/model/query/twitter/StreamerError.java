package edu.jhu.twacker.model.query.twitter;

/**
 * This class represents the possible errors received from the
 * Twitter Streaming API.
 * 
 * @author Daniel Deutsch
 */
public enum StreamerError
{
	UNAUTHORIZED,
	FORBIDDEN,
	UNKNOWN,
	NOT_ACCEPTABLE,
	TOO_LONG,
	RANGE_UNACCEPTABLE,
	RATE_LIMITED,
	SERVER_INTERNAL_ERROR,
	SERVICE_OVERLOADED;
	
	/**
	 * The constructor for the enum which sets the error code. 
	 * @param code The error code.
	 */
//	StreamerError(int code)
//	{
//
//	}
}
