package com.ami.fundapter;

import android.view.View.OnClickListener;



/**
 * This class depends on Google's image caching library to enable fetching
 * images from the web in a ListView.
 * 
 * @author Ami G
 * 
 * @param <T>
 */
public class ImageField<T> extends BaseStringField<T> {

    ImageLoader imageLoader;

    /**
     * 
     * @param viewResId
     *            - The resource ID of the view you want to bind to (Example:
     *            R.id.image).
     * @param extractor
     *            - An implementation that will extract the URL from the model
     *            object.
     * @param imageFetcher
     *            - A previously set-up image fetcher that will load images from
     *            the provided URL.
     */
    public ImageField(int viewResId, StringExtractor<T> extractor,
	    ImageLoader imageLoader) {
	super(viewResId, extractor);
	this.imageLoader = imageLoader;
    }

    @Override
    public ImageField<T> onClick(OnClickListener onClickListener) {
	
	return (ImageField<T>) super.onClick(onClickListener);
    }
}
