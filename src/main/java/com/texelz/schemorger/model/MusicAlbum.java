package com.texelz.schemorger.model;

/**
 *
 * A collection of music tracks.
 * @fullPath Thing > CreativeWork > MusicPlaylist > MusicAlbum
 *
 * @author Texelz (by Onhate)
 *
 */
public class MusicAlbum extends MusicPlaylist {

	private MusicGroup byArtist;
	/**
	 * The artist that performed this album or recording.
	 */
	public MusicGroup getByArtist() {
		return this.byArtist;
	}
	public void setByArtist(MusicGroup byArtist) {
		this.byArtist = byArtist;
	}
}
